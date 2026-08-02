package util.h.xy.ep;

/* loaded from: classes18.dex */
public class ma extends util.h.xy.ep.mc {
    private static char[] Camera2StreamConfigurationMap = null;
    private static int getHighResolutionOutputSizeshNQ4ISI = 1;
    private static long getHighSpeedVideoFpsRanges = 0;
    private static int getHighSpeedVideoFpsRangesFor = 0;
    private static byte[] getHighSpeedVideoSizes = null;
    private static int getOutputFormats = 0;
    private static int getOutputMinFrameDuration = 1;

    static {
        getHighSpeedVideoFpsRangesFor();
        getHighSpeedVideoSizes = new byte[]{1, 1, 1, 1, 1, 1, 1, 1, com.google.common.base.Ascii.US, com.google.common.base.Ascii.US, com.google.common.base.Ascii.US, com.google.common.base.Ascii.US, 14, 14, 14, 14, -32, -32, -32, -32, -15, -15, -15, -15, -2, -2, -2, -2, -2, -2, -2, -2, 1, -2, 1, -2, 1, -2, 1, -2, com.google.common.base.Ascii.US, -32, com.google.common.base.Ascii.US, -32, 14, -15, 14, -15, 1, -32, 1, -32, 1, -15, 1, -15, com.google.common.base.Ascii.US, -2, com.google.common.base.Ascii.US, -2, 14, -2, 14, -2, 1, com.google.common.base.Ascii.US, 1, com.google.common.base.Ascii.US, 1, 14, 1, 14, -32, -2, -32, -2, -15, -2, -15, -2, -2, 1, -2, 1, -2, 1, -2, 1, -32, com.google.common.base.Ascii.US, -32, com.google.common.base.Ascii.US, -15, 14, -15, 14, -32, 1, -32, 1, -15, 1, -15, 1, -2, com.google.common.base.Ascii.US, -2, com.google.common.base.Ascii.US, -2, 14, -2, 14, com.google.common.base.Ascii.US, 1, com.google.common.base.Ascii.US, 1, 14, 1, 14, 1, -2, -32, -2, -32, -2, -15, -2, -15};
        int i = getOutputMinFrameDuration + 77;
        getOutputFormats = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public static void m26661(byte[] bArr) {
        int i = getOutputMinFrameDuration;
        int i2 = i + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE;
        getOutputFormats = i2 % 128;
        getOutputFormats = (i + 9) % 128;
        for (int i3 = i2 % 2 != 0 ? 1 : 0; i3 < bArr.length; i3++) {
            getOutputFormats = (getOutputMinFrameDuration + 23) % 128;
            byte b = bArr[i3];
            bArr[i3] = (byte) ((b & 254) | ((((b >> 7) ^ ((((((b >> 1) ^ (b >> 2)) ^ (b >> 3)) ^ (b >> 4)) ^ (b >> 5)) ^ (b >> 6))) ^ 1) & 1));
        }
    }

    static void getHighSpeedVideoFpsRangesFor() {
        Camera2StreamConfigurationMap = new char[]{40042, 64979, 24342, 47364, 6832, 29939, 54847, 12389, 37323, 62215, 19782, 44720, 2229, 27198, 50284, 9687, 34641, 57685, 17079, 56571, 15935, 39030, 63893};
        getHighSpeedVideoFpsRanges = -364816807401488970L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0048, code lost:
    
        r1 = r1 + 1;
     */
    /* renamed from: ˊ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean m26660(byte[] bArr, int i) {
        int i2 = getOutputMinFrameDuration;
        getOutputFormats = (i2 + 15) % 128;
        if (bArr.length - i >= 8) {
            getOutputFormats = (i2 + 83) % 128;
            int i3 = 0;
            while (i3 < 16) {
                for (int i4 = 0; i4 < 8; i4++) {
                    int i5 = getOutputMinFrameDuration + 3;
                    getOutputFormats = i5 % 128;
                    if (i5 % 2 != 0) {
                        if (bArr[i4 + i] != getHighSpeedVideoSizes[i3 + 1 + i4]) {
                            break;
                        }
                    } else {
                        if (bArr[i4 + i] != getHighSpeedVideoSizes[(i3 * 8) + i4]) {
                            break;
                        }
                    }
                }
                return true;
            }
            return false;
        }
        int mode = android.view.View.MeasureSpec.getMode(0);
        int axisFromString = android.view.MotionEvent.axisFromString("");
        char normalizeMetaState = (char) android.view.KeyEvent.normalizeMetaState(0);
        java.lang.Object[] objArr = new java.lang.Object[1];
        int i6 = 23 - mode;
        int i7 = (-1) - axisFromString;
        util.h.xz.b.rb rbVar = new util.h.xz.b.rb();
        long[] jArr = new long[i6];
        rbVar.f2651 = 0;
        while (rbVar.f2651 < i6) {
            getHighSpeedVideoFpsRangesFor = (getHighResolutionOutputSizeshNQ4ISI + 107) % 128;
            jArr[rbVar.f2651] = (((char) (Camera2StreamConfigurationMap[rbVar.f2651 + i7] ^ 3446303986615426049L)) ^ (rbVar.f2651 * (3446303986615426049L ^ getHighSpeedVideoFpsRanges))) ^ normalizeMetaState;
            rbVar.f2651++;
        }
        char[] cArr = new char[i6];
        rbVar.f2651 = 0;
        while (rbVar.f2651 < i6) {
            cArr[rbVar.f2651] = (char) jArr[rbVar.f2651];
            rbVar.f2651++;
        }
        java.lang.String str = new java.lang.String(cArr);
        int i8 = getHighSpeedVideoFpsRangesFor + 59;
        getHighResolutionOutputSizeshNQ4ISI = i8 % 128;
        if (i8 % 2 != 0) {
            objArr[0] = str;
            throw new java.lang.IllegalArgumentException(((java.lang.String) objArr[0]).intern());
        }
        throw null;
    }
}
